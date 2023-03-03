package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GearActivityFinishPlayPictureRsp {
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Boolean isSuccess = null;
}
