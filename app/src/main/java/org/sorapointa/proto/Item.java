package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Material.*;
import org.sorapointa.proto.Material;
import org.sorapointa.proto.Equip.*;
import org.sorapointa.proto.Equip;
import org.sorapointa.proto.Furniture.*;
import org.sorapointa.proto.Furniture;

public class Item {
    @Tag(tag=1) public Integer itemId = null;
    @Tag(tag=2) public Long guid = null;
    @Tag(tag=5) public Material material = null;
    @Tag(tag=6) public Equip equip = null;
    @Tag(tag=7) public Furniture furniture = null;
}
