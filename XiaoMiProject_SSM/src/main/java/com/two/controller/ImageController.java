package com.two.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.two.utils.CpachaUtil;
@Controller
@RequestMapping("/image")

public class ImageController {
	@RequestMapping("VerifyImage")
	public void getImage(HttpSession session,OutputStream out){
		CpachaUtil c = new CpachaUtil();
		String str = c.generatorVCode();
		session.setAttribute("verify", str);
		BufferedImage image = c.generatorRotateVCodeImage(str, true);
		// 使用ImageIO流将缓冲流中的图片响应到界面上
		try {
			ImageIO.write(image, "gif",out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
