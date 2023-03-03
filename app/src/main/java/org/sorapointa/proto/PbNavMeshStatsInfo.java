package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PbNavMeshStatsInfo {
    @Tag(tag=10,isSigned=true) public Integer authorityAiInCombat = null;
    @Tag(tag=11,isSigned=true) public Integer noAuthorityAiInCombat = null;
    @Tag(tag=8,isSigned=true) public Integer totalAuthorityAi = null;
    @Tag(tag=13,isSigned=true) public Integer totalNoAuthorityAi = null;
}
