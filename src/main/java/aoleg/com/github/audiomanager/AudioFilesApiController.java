package aoleg.com.github.audiomanager;


import aoleg.com.github.audiomanager.api.AudiofilesApi;
import aoleg.com.github.audiomanager.model.DeleteAudioFile200Response;
import aoleg.com.github.audiomanager.model.GetAudioFiles200ResponseInner;
import aoleg.com.github.audiomanager.model.SaveAudioFile201Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class AudioFilesApiController implements AudiofilesApi {


    @Override
    public ResponseEntity<DeleteAudioFile200Response> deleteAudioFile(String fileId) {
        return null;
    }

    @Override
    public ResponseEntity<byte[]> getAudioFile(String fileId) {
        return null;
    }

    @Override
    public ResponseEntity<List<GetAudioFiles200ResponseInner>> getAudioFiles() {
        System.out.println("Test");
        return null;
    }

    @Override
    public ResponseEntity<SaveAudioFile201Response> saveAudioFile(MultipartFile file) {
        return null;
    }
}
