package com.somesh.sb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 
 * @author ksomalin
 *
 */
@Controller
@RequestMapping("ping")
public class PingController { 
    /**
     * Get ping Response 'SUCCESS' if this service is active.
     */
    @RequestMapping( method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> ping() {
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }
}