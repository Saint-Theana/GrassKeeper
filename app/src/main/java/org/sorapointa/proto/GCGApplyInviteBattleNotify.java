package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGApplyInviteBattleNotify {
    @Tag(tag=14) public Boolean isAgree = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
