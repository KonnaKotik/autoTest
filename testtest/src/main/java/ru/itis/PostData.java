package ru.itis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostData {

    private String title;
    private String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostData postData = (PostData) o;
        if(this.text.equals(postData.getText()) && this.title.equals(postData.getTitle())) {
            return true;
        } else  {
            return false;
        }
    }

}
