$(() => {
    $('.directory_edit').on('click', function () {
        let id = $(this).attr('data-id');
        let last_name = $(`#last_name_${id}`).text();
        let first_name = $(`#first_name_${id}`).text();
        let middle_name = $(`#middle_name_${id}`).text();

        $('#id').val(id);
        $('#last_name').val(last_name);
        $('#first_name').val(first_name);
        $('#middle_name').val(middle_name);
    });

    $('#save_author_directory').on('click', () => {
        $.ajax({
            url: location.href + `/store/${$('#id').val()}`,
            method: 'POST',
            data: {
                _csrf: $("meta[name='_csrf']").attr("content"),
                last_name: $('#last_name').val(),
                first_name: $('#first_name').val(),
                middle_name: $('#middle_name').val(),
            },
            success: () => {
                location.reload();
            },
        });
    });
});