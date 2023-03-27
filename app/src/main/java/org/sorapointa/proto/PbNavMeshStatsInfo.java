package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PbNavMeshStatsInfo {
    @Tag(tag=1,isSigned=true) public Integer totalNoAuthorityAi = null;
    @Tag(tag=11,isSigned=true) public Integer noAuthorityAiInCombat = null;
    @Tag(tag=12,isSigned=true) public Integer totalAuthorityAi = null;
    @Tag(tag=2,isSigned=true) public Integer authorityAiInCombat = null;
}
