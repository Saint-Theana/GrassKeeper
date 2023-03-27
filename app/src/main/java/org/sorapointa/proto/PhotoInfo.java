package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PhotoInfo {
    @Tag(tag=13) public List<PhotoPosData> photoPosDataList = new ArrayList<>();
    @Tag(tag=9) public Boolean isContentClosed = null;
}
