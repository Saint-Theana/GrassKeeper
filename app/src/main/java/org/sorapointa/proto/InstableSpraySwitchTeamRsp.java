package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InstableSpraySwitchTeamRsp {
    @Tag(tag=1) public Integer levelId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
