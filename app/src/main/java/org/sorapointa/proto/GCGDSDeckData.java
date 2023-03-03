package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSDeckData {
    @Tag(tag=1) public List<Integer> cardList = new ArrayList<>();
    @Tag(tag=15) public Integer cardBackId = null;
    @Tag(tag=10) public List<Integer> characterCardList = new ArrayList<>();
    @Tag(tag=5) public String name = null;
    @Tag(tag=3) public Integer id = null;
    @Tag(tag=13,isFixed=true) public Integer createTime = null;
    @Tag(tag=4) public Boolean isValid = null;
    @Tag(tag=7) public Integer fieldId = null;
}
