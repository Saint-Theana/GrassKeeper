package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class UseWidgetCreateGadgetReq {
    @Tag(tag=15) public Vector pos = null;
    @Tag(tag=12) public Vector rot = null;
    @Tag(tag=4) public Integer materialId = null;
}
