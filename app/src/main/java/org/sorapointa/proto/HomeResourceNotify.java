package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeResource.*;
import org.sorapointa.proto.HomeResource;

public class HomeResourceNotify {
    @Tag(tag=9) public HomeResource homeCoin = null;
    @Tag(tag=8) public HomeResource fetterExp = null;
}
