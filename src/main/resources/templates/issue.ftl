<#import "parts/layout.ftl" as c>

<@c.page>

    <div class="container">

        <div class="card shadow-lg mb-3">
            <div class="card-header">Issue</div>
            <div class="card-body">
                <form action="/issue/issue" method="post">
                    <input type="hidden" value="${_csrf.token}" name="_csrf">

                    <div class="row">
                        <div class="col-lg-5">
                            <label class="sr-only" for="bookId">Book</label>
                            <div class="input-group mb-2">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">Book</div>
                                </div>
                                <select class="form-control select2" name="bookId">
                                    <#list notIssued as book>
                                        <option value="${book.id}">${book.name}</option>
                                    </#list>
                                </select>
                            </div>
                        </div>
                        <div class="col-lg-5">
                            <label class="sr-only" for="readerId">Reader</label>
                            <div class="input-group mb-2">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">Reader</div>
                                </div>
                                <select class="form-control select2" name="readerId">
                                    <#list readers as reader>
                                        <option value="${reader.id}">${reader.lastName} ${reader.firstName} ${reader.middleName}</option>
                                    </#list>
                                </select>
                            </div>
                        </div>
                        <div class="col-lg-2">
                            <button id="issue_book" class="btn-block btn btn-primary">Save</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>

        <div class="card shadow-lg">
            <div class="card-header">Accept</div>
            <div class="card-body">
                <form action="/issue/accept" method="post">
                    <input type="hidden" value="${_csrf.token}" name="_csrf">

                <div class="row">
                        <div class="col-lg-5">
                            <label class="sr-only" for="bookId">Book</label>
                            <div class="input-group mb-2">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">Book</div>
                                </div>
                                <select class="form-control select2" name="bookId">
                                    <#list issued as book>
                                        <option value="${book.id}">${book.name}</option>
                                    </#list>
                                </select>
                            </div>
                        </div>
                        <div class="col-lg-5">
                            <label class="sr-only" for="readerId">Reader</label>
                            <div class="input-group mb-2">
                                <div class="input-group-prepend">
                                    <div class="input-group-text">Reader</div>
                                </div>
                                <select class="form-control select2" name="readerId">
                                    <#list readers as reader>
                                        <option value="${reader.id}">${reader.lastName} ${reader.firstName} ${reader.middleName}</option>
                                    </#list>
                                </select>
                            </div>
                        </div>
                        <div class="col-lg-2">
                            <button id="issue_book" class="btn-block btn btn-primary">Save</button>
                        </div>
                </div>
                </form>

            </div>
        </div>
    </div>

</@c.page>
