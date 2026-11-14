package org.openapitools.api;

import org.openapitools.model.ErrorResponse;
import org.springframework.lang.Nullable;
import org.openapitools.model.Task;
import org.openapitools.model.TaskCreateRequest;
import org.openapitools.model.TaskDeleteResponse;
import org.openapitools.model.TaskListResponse;
import org.openapitools.model.TaskPatchRequest;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-14T23:26:46.713961100+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.27.0")
@Controller
@RequestMapping("${openapi.tODOList.base-path:/api/v1}")
public class TasksApiController implements TasksApi {

    private final NativeWebRequest request;

    @Autowired
    public TasksApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
