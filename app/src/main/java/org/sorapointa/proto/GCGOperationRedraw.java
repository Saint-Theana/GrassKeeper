package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGOperationRedraw {
    @Tag(tag=2) public List<Integer> cardList = new ArrayList<>();
}
