package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayOwnerStartInviteReq {
    @Tag(tag=3) public Integer mpPlayId = null;
    @Tag(tag=6) public Boolean isSkipMatch = null;
}
