package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayOwnerStartInviteRsp {
    @Tag(tag=7) public Boolean isSkipMatch = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer playId = null;
}
