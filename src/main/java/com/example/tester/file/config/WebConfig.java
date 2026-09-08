import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class config implements WebMvcConfigurer {

    private String uploadPath = "/Users/juhyogug/Documents/tester/uploads/board"; // 위에서 설정한 업로드 경로

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // /upload/** 로 요청이 오면 C:/board/upload/ 경로에서 파일을 읽어옴
        registry.addResourceHandler("/upload/**")
                .addResourceLocations(uploadPath);
    }
}
