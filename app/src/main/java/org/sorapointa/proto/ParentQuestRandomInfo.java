package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ParentQuestRandomInfo {
    @Tag(tag=1) public Integer entranceId = null;
    @Tag(tag=3) public List<Integer> factorList = new ArrayList<>();
    @Tag(tag=6) public Integer templateId = null;
}
