package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class GachaTransferItem {
    @Tag(tag=3) public ItemParam item = null;
    @Tag(tag=1) public Boolean isTransferItemNew = null;
}
