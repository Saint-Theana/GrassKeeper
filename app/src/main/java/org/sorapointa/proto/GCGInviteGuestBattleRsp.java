package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGInviteGuestBattleRsp {
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer uid = null;
}
