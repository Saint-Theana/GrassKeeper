package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomePictureFrameInfo.*;
import org.sorapointa.proto.HomePictureFrameInfo;

public class HomeUpdatePictureFrameInfoReq {
    @Tag(tag=1) public HomePictureFrameInfo pictureFrameInfo = null;
}
