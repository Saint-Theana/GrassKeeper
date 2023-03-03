package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeTeamNameRsp {
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public String teamName = null;
    @Tag(tag=4,isSigned=true) public Integer teamId = null;
}
