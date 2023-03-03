package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChooseCurAvatarTeamRsp {
    @Tag(tag=1) public Integer curTeamId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
