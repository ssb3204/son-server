package controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;

@RestController
public class MemberService{

    @GetMapping("/members")
    @Operation(summary = "회원조회")
    public void getMember() {
    }

    @PostMapping("/member")
    @Operation(summary = "회원조회")
    public void register() {
    }


    @DeleteMapping("/memberes")
    @Operation(summary = "회원조회")
    public void delete() {
    }
}
