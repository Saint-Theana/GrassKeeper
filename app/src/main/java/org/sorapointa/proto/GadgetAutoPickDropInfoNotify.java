package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Item.*;
import org.sorapointa.proto.Item;

public class GadgetAutoPickDropInfoNotify {
    @Tag(tag=11) public List<Item> itemList = new ArrayList<>();
}
