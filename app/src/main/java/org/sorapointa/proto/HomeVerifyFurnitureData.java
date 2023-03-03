package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeVerifyFurnitureData {
    @Tag(tag=7) public List<Integer> type = new ArrayList<>();
    @Tag(tag=5) public Integer id = null;
    @Tag(tag=9) public Integer num = null;
}
