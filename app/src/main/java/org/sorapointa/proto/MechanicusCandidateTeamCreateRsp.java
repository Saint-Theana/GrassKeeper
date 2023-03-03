package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusCandidateTeamCreateRsp {
    @Tag(tag=1) public Integer dungeonId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer difficultLevel = null;
}
