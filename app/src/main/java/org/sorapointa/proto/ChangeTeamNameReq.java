package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeTeamNameReq {
    @Tag(tag=8,isSigned=true) public Integer teamId = null;
    @Tag(tag=9) public String teamName = null;
}
