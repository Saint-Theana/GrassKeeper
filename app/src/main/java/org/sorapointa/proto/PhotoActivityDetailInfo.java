package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PhotoPosData.*;
import org.sorapointa.proto.PhotoPosData;

public class PhotoActivityDetailInfo {
    @Tag(tag=4) public Boolean isContentClosed = null;
    @Tag(tag=12) public List<PhotoPosData> photoPosDataList = new ArrayList<>();
}
