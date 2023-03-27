package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSDeckData {
    @Tag(tag=14) public List<Integer> characterCardList = new ArrayList<>();
    @Tag(tag=4) public Boolean isValid = null;
    @Tag(tag=9) public Integer createTime = null;
    @Tag(tag=3) public String name = null;
    @Tag(tag=2) public Integer cardBackId = null;
    @Tag(tag=6) public Integer fieldId = null;
    @Tag(tag=12) public List<Integer> cardList = new ArrayList<>();
    @Tag(tag=15) public Integer id = null;
}
