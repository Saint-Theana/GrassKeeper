package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomePictureFrameInfo.*;
import org.sorapointa.proto.HomePictureFrameInfo;

public class HomeUpdatePictureFrameInfoRsp {
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public HomePictureFrameInfo pictureFrameInfo = null;
}
