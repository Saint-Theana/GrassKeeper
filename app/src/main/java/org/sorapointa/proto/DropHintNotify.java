package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class DropHintNotify {
    @Tag(tag=7) public Vector position = null;
    @Tag(tag=14) public List<Integer> itemIdList = new ArrayList<>();
}
