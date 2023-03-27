package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalvageEscortInfo {
    @Tag(tag=6) public Integer maxBoxCount = null;
    @Tag(tag=2) public Integer boxCount = null;
    @Tag(tag=4) public Integer maxMonsterCount = null;
    @Tag(tag=1) public Integer monsterCount = null;
}
