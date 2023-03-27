package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeVerifyFurnitureData {
    @Tag(tag=7) public Integer id = null;
    @Tag(tag=6) public Integer num = null;
    @Tag(tag=1) public List<Integer> type = new ArrayList<>();
}
