package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AranaraCollectionSuite.*;
import org.sorapointa.proto.AranaraCollectionSuite;

public class AranaraCollectionDataNotify {
    @Tag(tag=14) public List<AranaraCollectionSuite> collectionSuiteList = new ArrayList<>();
}
