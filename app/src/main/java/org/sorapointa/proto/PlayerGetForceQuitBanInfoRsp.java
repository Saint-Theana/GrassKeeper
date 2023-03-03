package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerGetForceQuitBanInfoRsp {
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer matchId = null;
    @Tag(tag=13) public Integer expireTime = null;
}
