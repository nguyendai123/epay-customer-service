package com.example.epaycustomerservice.controller;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;


import com.example.epaycustomerservice.dto.EmployeeDto;
import com.example.epaycustomerservice.model.Employee;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EmployeeControllerDocs {
    // Các phương thức xử lý yêu cầu API cho nhân viên (bổ sung tài liệu Swagger)
    @Operation(summary = "Insert Employee Example")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Insert success !!",
                    content = {
                     @Content(mediaType = "application/json",
            schema = @Schema(implementation = Employee.class))
            }),
            @ApiResponse(responseCode = "400", description = "Insert fail !!",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Not found !!",
                    content = @Content)})
      List< Employee > insertEmployeeExample(@RequestBody EmployeeDto employeeDto);


}
