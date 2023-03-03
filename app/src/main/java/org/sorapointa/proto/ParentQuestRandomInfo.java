package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ParentQuestRandomInfo {
    @Tag(tag=1) public List<Integer> factorList = new ArrayList<>();
    @Tag(tag=8) public Integer templateId = null;
    @Tag(tag=2) public Integer entranceId = null;
}
