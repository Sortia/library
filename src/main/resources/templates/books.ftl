<#import "parts/layout.ftl" as c>

<script src="/static/js/book.js" defer></script>

<@c.page>

    <h2>Books</h2>

    <div class="container-fluid">
        <button class="btn btn-primary mb-3 reader_edit" data-toggle="modal" data-target="#editModal" data-id="0">Create</button>

        <div class="row">
            <div class="col-lg-6">
                <label class="sr-only" for="create_activity_id">Activity</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Activity</div>
                    </div>
                    <select class="form-control select2" id="create_activity_id" name="activity_id">
                        <#list activities as activity>
                            <option value="${activity.id}">${activity.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="col-lg-6">
                <label class="sr-only" for="create_author_id">Author</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Author</div>
                    </div>
                    <select class="form-control select2" id="create_author_id" name="author_id">
                        <#list authors as author>
                            <option value="${author.id}">${author.lastName} ${author.firstName} ${author.middleName}</option>
                        </#list>
                    </select>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-4">
                <label class="sr-only" for="create_format_id">Format</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Format</div>
                    </div>
                    <select class="form-control select2" id="create_format_id" name="format_id">
                        <#list formats as format>
                            <option value="${format.id}">${format.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="col-lg-4">
                <label class="sr-only" for="create_genre_id">Genre</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Genre</div>
                    </div>
                    <select class="form-control select2" id="create_genre_id" name="genre_id">
                        <#list genres as genre>
                            <option value="${genre.id}">${genre.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="col-lg-4">
                <label class="sr-only" for="create_keyword_id">Keyword</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Keyword</div>
                    </div>
                    <select class="form-control select2" id="create_keyword_id" name="keyword_id">
                        <#list keywords as keyword>
                            <option value="${keyword.id}">${keyword.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-4">
                <label class="sr-only" for="create_publisher_id">Publisher</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Publisher</div>
                    </div>
                    <select class="form-control select2" id="create_publisher_id" name="publisher_id">
                        <#list publishers as publisher>
                            <option value="${publisher.id}">${publisher.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="col-lg-4">
                <label class="sr-only" for="create_type_id">Type</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Type</div>
                    </div>
                    <select class="form-control select2" id="create_type_id" name="type_id">
                        <#list types as type>
                            <option value="${type.id}">${type.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="col-lg-4">
                <label class="sr-only" for="create_department_id">Department</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Department</div>
                    </div>
                    <select class="form-control select2" id="create_department_id" name="department_id">
                        <#list departments as department>
                            <option value="${department.id}">${department.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-2 offset-lg-10">
                <button class="btn btn-primary btn-block">Search</button>
            </div>
        </div>
    </div>

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
                        <div class="row">
                            <div class="col-lg-6">
                                <label for="create_name">Name</label>
                                <input class="form-control" id="create_name" name="create_name" type="text">
                            </div>
                            <div class="col-lg-6">
                                <label for="create_cost">Cost</label>
                                <input class="form-control" id="create_cost" name="create_cost" type="text">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-6">
                                <label for="create_year">Year</label>
                                <input class="form-control" id="create_year" name="create_year" type="text">
                            </div>
                            <div class="col-lg-6">
                                <label for="create_pages">Pages</label>
                                <input class="form-control" id="create_pages" name="create_pages" type="text">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-12">
                                <label for="create_pages">Annotation</label>
                                <textarea class="form-control" name="create_annotation" id="create_annotation" cols="30" rows="10"></textarea>
                            </div>
                        </div>

                        <div class="row mt-3">
                            <div class="col-lg-6">
                                <label class="sr-only" for="create_activity_id">Activity</label>
                                <div class="input-group mb-2">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">Activity</div>
                                    </div>
                                    <select class="form-control " id="create_activity_id">
                                        <#list activities as activity>
                                            <option value="${activity.id}">${activity.name}</option>
                                        </#list>
                                    </select>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <label class="sr-only" for="create_author_id">Author</label>
                                <div class="input-group mb-2">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">Author</div>
                                    </div>
                                    <select class="form-control" id="create_author_id">
                                        <#list authors as author>
                                            <option value="${author.id}">${author.lastName} ${author.firstName} ${author.middleName}</option>
                                        </#list>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-4">
                                <label class="sr-only" for="create_format_id">Format</label>
                                <div class="input-group mb-2">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">Format</div>
                                    </div>
                                    <select class="form-control " id="create_format_id">
                                        <#list formats as format>
                                            <option value="${format.id}">${format.name}</option>
                                        </#list>
                                    </select>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <label class="sr-only" for="create_genre_id">Genre</label>
                                <div class="input-group mb-2">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">Genre</div>
                                    </div>
                                    <select class="form-control " id="create_genre_id">
                                        <#list genres as genre>
                                            <option value="${genre.id}">${genre.name}</option>
                                        </#list>
                                    </select>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <label class="sr-only" for="create_keyword_id">Keyword</label>
                                <div class="input-group mb-2">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">Keyword</div>
                                    </div>
                                    <select class="form-control " id="create_keyword_id">
                                        <#list keywords as keyword>
                                            <option value="${keyword.id}">${keyword.name}</option>
                                        </#list>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-4">
                                <label class="sr-only" for="create_publisher_id">Publisher</label>
                                <div class="input-group mb-2">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">Publisher</div>
                                    </div>
                                    <select class="form-control " id="create_publisher_id">
                                        <#list publishers as publisher>
                                            <option value="${publisher.id}">${publisher.name}</option>
                                        </#list>
                                    </select>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <label class="sr-only" for="create_type_id">Type</label>
                                <div class="input-group mb-2">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">Type</div>
                                    </div>
                                    <select class="form-control " id="create_type_id">
                                        <#list types as type>
                                            <option value="${type.id}">${type.name}</option>
                                        </#list>
                                    </select>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <label class="sr-only" for="create_department_id">Department</label>
                                <div class="input-group">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">Department</div>
                                    </div>
                                    <select class="form-control " id="create_department_id">
                                        <#list departments as department>
                                            <option value="${department.id}">${department.name}</option>
                                        </#list>
                                    </select>
                                </div>
                            </div>
                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" id="save_book">Save</button>
                </div>
            </div>
        </div>
    </div>


</@c.page>
