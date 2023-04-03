package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomePictureFrameInfo.*;
import org.sorapointa.proto.HomePictureFrameInfo;

public class HomePictureFrameInfoNotify {
    public enum HomePictureFrameInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4677) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public List<HomePictureFrameInfo> pictureFrameInfoList = new ArrayList<>();
}
