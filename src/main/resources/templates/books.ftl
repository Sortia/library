<#import "parts/layout.ftl" as c>

<@c.page>

    <h2>Books</h2>

    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-4">
                <label class="sr-only" for="activity_id">Activity</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Activity</div>
                    </div>
                    <select class="form-control select2" id="activity_id" name="activity_id">
                        <option value="">Select option</option>
                        <#list activities as activity>
                            <option value="${activity.id}">${activity.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="col-lg-4">
                <label class="sr-only" for="author_id">Author</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Author</div>
                    </div>
                    <select class="form-control select2" id="author_id" name="author_id">
                        <option value="">Select option</option>
                        <#list authors as author>
                            <option value="${author.id}">${author.lastName} ${author.firstName} ${author.middleName}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="col-lg-4">
                <label class="sr-only" for="department_id">Department</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Department</div>
                    </div>
                    <select class="form-control select2" id="department_id" name="department_id">
                        <option value="">Select option</option>
                        <#list departments as department>
                            <option value="${department.id}">${department.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-4">
                <label class="sr-only" for="format_id">Format</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Format</div>
                    </div>
                    <select class="form-control select2" id="format_id" name="format_id">
                        <option value="">Select option</option>
                        <#list formats as format>
                            <option value="${format.id}">${format.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="col-lg-4">
                <label class="sr-only" for="genre_id">Genre</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Genre</div>
                    </div>
                    <select class="form-control select2" id="genre_id" name="genre_id">
                        <option value="">Select option</option>
                        <#list genres as genre>
                            <option value="${genre.id}">${genre.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="col-lg-4">
                <label class="sr-only" for="keyword_id">Keyword</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Keyword</div>
                    </div>
                    <select class="form-control select2" id="keyword_id" name="keyword_id">
                        <option value="">Select option</option>
                        <#list keywords as keyword>
                            <option value="${keyword.id}">${keyword.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-4">
                <label class="sr-only" for="publisher_id">Publisher</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Publisher</div>
                    </div>
                    <select class="form-control select2" id="publisher_id" name="publisher_id">
                        <option value="">Select option</option>
                        <#list publishers as publisher>
                            <option value="${publisher.id}">${publisher.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="col-lg-4">
                <label class="sr-only" for="state_id">State</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">State</div>
                    </div>
                    <select class="form-control select2" id="state_id" name="state_id">
                        <option value="">Select option</option>
                        <#list states as state>
                            <option value="${state.id}">${state.name}</option>
                        </#list>
                    </select>
                </div>
            </div>
            <div class="col-lg-4">
                <label class="sr-only" for="type_id">Type</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Type</div>
                    </div>
                    <select class="form-control select2" id="type_id" name="type_id">
                        <option value="">Select option</option>
                        <#list types as type>
                            <option value="${type.id}">${type.name}</option>
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


</@c.page>
