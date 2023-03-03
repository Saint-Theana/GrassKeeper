package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSceneJumpRsp {
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Boolean isEnterRoomScene = null;
}
