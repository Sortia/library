$(() => {
    $('.directory_edit').on('click', function() {
        let id = $(this).attr('data-id');
        let name = $(`#name_${id}`).text();
        console.log(id, name);

        $('#id').val(id);
        $('#name').val(name);
    });

    $('body').on('click', '#save_directory', () => {
        $.ajax({
            url: `/directory/genre/store/${$('#id').val()}`,
            method: 'POST',
            data: {
                _csrf: $("meta[name='_csrf']").attr("content"),
                name: $('#name').val(),
            },
            success: () => {
                location.reload();
            },
        });
    });
});