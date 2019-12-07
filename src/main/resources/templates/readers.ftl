<#import "parts/layout.ftl" as c>

<script src="/static/js/reader.js" defer></script>

<@c.page>

    <h2>Readers</h2>

    <button class="btn btn-primary mb-3 reader_edit" data-toggle="modal" data-target="#editModal" data-id="0">Create
    </button>

    <table data-toggle="table">
        <thead>
        <tr>
            <th data-width="100">Id</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Passport</th>
            <th data-width="100">Delete</th>
        </tr>
        </thead>
        <tbody>
        <#list readers as reader>
            <tr>
                <td>${reader.id}</td>
                <td id="name_${reader.id}">${reader.lastName!''} ${reader.firstName!''} ${reader.middleName!''}</td>
                <td id="name_${reader.id}">${reader.phone!''}</td>
                <td id="name_${reader.id}">${reader.email!''}</td>
                <td id="name_${reader.id}">${reader.passportSeries!''} ${reader.passportNumber!''} ${reader.passportBy!''}</td>
                <td><a href="/readers/delete/${reader.id}" class="btn btn-danger">Delete</a></td>
            </tr>
        </#list>
        </tbody>
    </table>

    <div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="editModalLabel"
         aria-hidden="true">
        <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="editModalLabel">Create reader</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form>

                        <div class="form-group">
                            <div class="row">
                                <div class="col-lg-4">
                                    <label for="last_name">Last Name</label>
                                    <input class="form-control" id="last_name" name="last_name" type="text">
                                </div>
                                <div class="col-lg-4">
                                    <label for="first_name">First Name</label>
                                    <input class="form-control" id="first_name" name="first_name" type="text">
                                </div>
                                <div class="col-lg-4">
                                    <label for="middle_name">Middle Name</label>
                                    <input class="form-control" id="middle_name" name="middle_name" type="text">
                                </div>
                            </div>

                        </div>

                        <div class="form-group">
                            <div class="row">
                                <div class="col-lg-6">
                                    <label for="phone">Phone</label>
                                    <input class="form-control" id="phone" name="phone" type="text">
                                </div>
                                <div class="col-lg-6">
                                    <label for="email">Email</label>
                                    <input class="form-control" id="email" name="email" type="text">
                                </div>
                            </div>

                        </div>

                        <div class="form-group">
                            <div class="row">

                                <div class="col-lg-4">
                                    <label for="passport_series">Passport series</label>
                                    <input class="form-control" id="passport_series" name="passport_series" type="text">
                                </div>
                                <div class="col-lg-4">
                                    <label for="passport_number">Passport number</label>
                                    <input class="form-control" id="passport_number" name="passport_number" type="text">
                                </div>
                                <div class="col-lg-4">
                                    <label for="passport_by">Passport by</label>
                                    <input class="form-control" id="passport_by" name="passport_by" type="text">
                                </div>
                            </div>
                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" id="save_reader">Save</button>
                </div>
            </div>
        </div>
    </div>

</@c.page>
