$(() => {
    $('#save_reader').on('click', () => {
        $.ajax({
            url: location.href + `/store`,
            method: 'POST',
            data: {
                _csrf: $("meta[name='_csrf']").attr("content"),
                lastName: $('#last_name').val(),
                firstName: $('#first_name').val(),
                middleName: $('#middle_name').val(),
                phone: $('#phone').val(),
                email: $('#email').val(),
                passportSeries: $('#passport_series').val(),
                passportNumber: $('#passport_number').val(),
                passportBy: $('#passport_by').val(),
            },
            success: () => {
                location.reload();
            },
        });
    });
});








