package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AISnapshotEntitySkillCycle {
    @Tag(tag=4) public Boolean selected = null;
    @Tag(tag=12) public Boolean trydoskill = null;
    @Tag(tag=3) public Boolean failed = null;
    @Tag(tag=15) public Integer skillId = null;
    @Tag(tag=9) public Boolean success = null;
}
