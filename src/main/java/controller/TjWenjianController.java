package .controller;

import .service.TjWenjianService;
import .api.TjWenjianApi;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

/**
 * 上传文件表(TjWenjian)表控制层
 *
 * @author cadinal.tech
 * @since 2021-11-13 21:01:51
 */
@RequiredArgsConstructor
@RestController
public class TjWenjianController implements TjWenjianApi{

    private final TjWenjianService tjWenjianService;

    @Override
    public TjWenjianService getService(){
        return tjWenjianService;
     }
}