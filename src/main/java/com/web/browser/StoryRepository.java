package com.web.browser;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class StoryRepository {

    private final List<Story> ALL_STORIES = new ArrayList<>(Arrays.asList(
            new Story(1l,"Finding Hope for a dear friend","Certified September 14, 2018","After months of feeling confused and helpless I discovered BlahBlah and they helped me understand how I could help and comfort and direct my friends in need"),
            new Story(2l,"Finding Hope for a dear friend","Certified September 14, 2018","After months of feeling confused and helpless I discovered BlahBlah and they helped me understand how I could help and comfort and direct my friends in need"),
            new Story(3l,"Finding Hope for a dear friend","Certified September 14, 2018","After months of feeling confused and helpless I discovered BlahBlah and they helped me understand how I could help and comfort and direct my friends in need"),
            new Story(4l,"Finding Hope for a dear friend","Certified September 14, 2018","After months of feeling confused and helpless I discovered BlahBlah and they helped me understand how I could help and comfort and direct my friends in need"),
            new Story(5l, "Finding Hope for a dear friend","Certified September 14, 2018","After months of feeling confused and helpless I discovered BlahBlah and they helped me understand how I could help and comfort and direct my friends in need"),
            new Story(6l,"Finding Hope for a dear friend","Certified September 14, 2018","After months of feeling confused and helpless I discovered BlahBlah and they helped me understand how I could help and comfort and direct my friends in need")
    ));

    public List<Story> getALL_STORIES(){return ALL_STORIES;}

    public Story findById(Long id){
        for (Story story: ALL_STORIES){
            if (id == story.getId()){
                return story;
            }
        }
        return null;
    }
}
