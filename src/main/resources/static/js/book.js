$(() => {
    $('#save_book').on('click', () => {
        $.ajax({
            url: location.href + `/store`,
            method: 'POST',
            data: {
                _csrf: $("meta[name='_csrf']").attr("content"),
                activityId: $('#create_activity_id').val(),
                authorId: $('#create_author_id').val(),
                formatId: $('#create_format_id').val(),
                genreId: $('#create_genre_id').val(),
                keywordId: $('#create_keyword_id').val(),
                publisherId: $('#create_publisher_id').val(),
                typeId: $('#create_type_id').val(),
                departmentId: $('#create_department_id').val(),
                name: $('#create_name').val(),
                cost: $('#create_cost').val(),
                year: $('#create_year').val(),
                pages: $('#create_pages').val(),
                annotation: $('#create_annotation').val(),
            },
            success: () => {
                location.reload();
            },
        });
    });
});