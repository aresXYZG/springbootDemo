package com.hlx.service;

        import org.springframework.stereotype.Service;

@Service
public interface UserCheckService {

    UserCheckDtoResp doCall(UserCheckDtoReq userCheckDtoReq);
}
