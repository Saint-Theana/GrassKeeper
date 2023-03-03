package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayOwnerStartInviteRsp {
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer mpPlayId = null;
    @Tag(tag=9) public Boolean isSkipMatch = null;
}
