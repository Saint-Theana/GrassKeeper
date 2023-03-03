package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class WidgetCreateLocationInfo {
    @Tag(tag=3) public Vector rot = null;
    @Tag(tag=10) public Vector pos = null;
}
